function setupForm(formName, url)
{
    $('#' + formName + 'Form').on('submit', function()
    {
        console.log($(this));
        console.log($(this).serialize());
        $.ajax({
            url : url,
            type : 'POST',
            data : $(this).serialize(),
            success: function (data) {
                processResponse(data);
            }
        })
    });

    function processResponse(data)
    {
        //TODO: show error text in the corresponding boxes
        //results.get(index).getDefaultMessage() to get message
        //results.get(index).arguments.defaultMessage
    }
}