function CallPrint(strid) {
    var prtContent = document.getElementById(strid);
    var WinPrint = window.open('','','top=3000,left=3000,width=100,height=100,enubar=0, toolbar=0, location=0, directories=0, status=0, scrollbars=0, resizable=0');
    WinPrint.blur();

    var print = document.createElement("div");
    print.className = "mVideo";
    print.setAttribute("id", "print");
    print.appendChild(prtContent.cloneNode(true));
    
    WinPrint.document.body.appendChild(print);

    WinPrint.blur();
    WinPrint.print();
    WinPrint.close();
    location.replace(href="/")
}