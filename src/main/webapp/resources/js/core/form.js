function setupForm(formName, postUrl, onSuccessUrl, isDialogContent)
{
    $('#' + formName + 'Form').on('submit', function()
    {
        $.ajax({
            url : postUrl,
            type : 'POST',
            data : $(this).serialize(),
            success : function (data) {
                processResponse(data);
            }
        })
    });

    function processResponse(data)
    {
        console.log("Data response:");
        console.log(data);
        alert(data['message']);
        closeDialog();


        //var dataMap = $.parseJSON(data);
        //TODO: show error text in the corresponding boxes
        //results.get(index).getDefaultMessage() to get message
        //results.get(index).arguments.defaultMessage
    }
}