function openDialog(contentPath) {

    $.ajax({
        url : '/dialog',
        type : 'GET',
        success : function (response) {
            insertContentIntoDialogHTML(response.toString(), contentPath);
        },
        error : function (response) {
            console.log("Error occurred upon request when trying to retrieve dialog skeleton. Error response:");
            console.log(response);
        }
    });

    function insertContentIntoDialogHTML(dialogHTML, contentURL)
    {
        $.ajax({
            url: contentURL,
            type: 'GET',
            success: function (response) {
                placeDialogOntoPage(dialogHTML.replace('{CONTENT}', response.toString()));
            },
            error : function (response) {
                console.log("Error occurred upon request when trying to retrieve dialog content. Error response:");
                console.log(response);
            }
        });
    }

    function placeDialogOntoPage(dialogHTML)
    {
        $('html > body').append(dialogHTML);
    }
}

function closeDialog() {
    $('.dialog').remove();
}