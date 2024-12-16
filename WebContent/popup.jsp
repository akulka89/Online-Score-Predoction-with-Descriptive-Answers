<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title> Test</title>
        <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.1/themes/base/jquery-ui.css">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.1/jquery-ui.min.js"></script>

        <script>
           function OpenModal() {
                $("#divModal").dialog({
                    autoOpen: false, modal: true, title: 'Detected as fake News', width: 'auto', height: 'auto'
                    , buttons: { "Cancel": function () { $(this).dialog("close"); } },
                }).dialog('open');
                return false;
            }
        </script>
    </head>

    <body>
        <a href="#" onclick="javascript:OpenModal();">View Page</a>
        <div style="display:none;" id="divModal">
            <iframe id="myIframe" src="notify.jsp" width="600" height="300" />
        </div>
    </body>
</html>