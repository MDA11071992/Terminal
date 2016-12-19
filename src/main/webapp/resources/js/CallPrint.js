function CallPrint(strid) {
    var prtContent = document.getElementById(strid);
    var prtCSS = '<link rel="stylesheet" href="/resources/css/print.css" type="text/css" />';
    var WinPrint = window.open('','','top=50,left=50,width=500,height=500, menubar=0, toolbar=0, location=0, status=0, scrollbars=0, resizable=0');
    var print = document.createElement("div");

    print.className = "mVideo";
    print.setAttribute("id", "print");
    print.appendChild(prtContent.cloneNode(true));
    
    WinPrint.document.body.appendChild(print);

    WinPrint.blur();
    WinPrint.print();
    WinPrint.close();
    location.replace(href="/terminal")
}