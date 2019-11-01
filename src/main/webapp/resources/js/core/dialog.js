function openDialog(contentPath) {
    //TODO: Clean this up. Split into two requests that merge the response strings after both are successful.
    $.ajax({
        url : contentPath,
        type : 'GET',
        success : function (contentData) {
            $.ajax({
                url : '/dialog',
                type : 'GET',
                success : function (dialogData) {
                    $('html > body').append(dialogData.toString().replace('{CONTENT}', contentData));
                }
            })
        }
    })
}

function closeDialog() {
    $('.dialog').remove();
}