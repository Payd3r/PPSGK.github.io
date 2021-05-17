
// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();

function openPage(pageName, elmnt, color) {
    // Hide all elements with class="tabcontent" by default */
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }

    // Remove the background color of all tablinks/buttons
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].style.backgroundColor = "";
    }

    // Show the specific tab content
    document.getElementById(pageName).style.display = "block";

    // Add the specific color to the button used to open the tab content
    elmnt.style.backgroundColor = color;
};
function getFromFile(tipo, s) {
    var temp;
    var file = p.GetFile(s);
    var streamReader = file.OpenAsTextStream(1);
    let i = 0;
    while (!streamReader.AtEndOfStream) {
        if (!tipo)
            temp[i] = new Articolo(streamReader.ReadLine());
        else
            temp[i] = new Ricetta(streamReader.ReadLine());
        i++;
    }
    return temp;
};

var app = new Vue(
    {
        el: '#contenitore-vue',
        data: {
            Ricette: getFromFile(true, "D:\\File\\  Scuola\\Superiori\\      4°superiore\\GitHub\\PPSGK\\SharedFiles\\Ricette.txt"),
            Articoli: getFromFile(false, "D:\\File\\  Scuola\\Superiori\\      4°superiore\\GitHub\\PPSGK\\SharedFiles\\Articoli.txt"),
            RicetteTot: getFromFile(true, "D:\\File\\  Scuola\\Superiori\\      4°superiore\\GitHub\\PPSGK\\SharedFiles\\RicetteTot.txt"),
        },
        methods: {
            writeOnFile(tipo) {
                if (tipo) {
                    //aggiungi articolo
                    //prendo le info e le metto in una stringa
                    //stampo nel txt comandi il numero dell'operazione da eseguire
                    //a capo stampo l'articolo
                }
                else {
                    //aggiungi ricetta
                    //prendo le info e le metto in una stringa
                    //stampo nel txt comandi il numero dell'operazione da eseguire
                    //a capo stampo la ricetta
                }
            }
        }
    });