## Design architetturale

### Architettura complessiva

Per un'architettura idonea del progetto che vogliamo sviluppare abbiamo deciso di sfruttare il pattern MVC, separandolo quindi in tre macro componenti: Model, View e Controller, di seguito uno schema riassuntivo della composizione e interazione dei componenti:

### Descrizione del pattern MVC

MVC (Model-View-Controller) è un pattern di design del software comunemente usato per implementare interfacce utente, dominio e logica di controllo. Il punto focale di questo pattern è la separazione tra la logica del software e l'interfaccia dell'utente, tale "separazione di concetti" permette una migliore divisione del lavoro tra team di sviluppatori. Le tre principali componenti di questo pattern sono:
<dl>
	<dt>Model</dt>
	<dd>
		Il Model definisce i dati che l'applicativo è in grado di gestire, in generale un componente passivo che supporta la lettura e scrittura da parte del controller dei dati introducendo controlli sulla loro correttezza.
	</dd>
	<dt>View</dt>
	<dd>
		La View definisce l'interfaccia che viene mostrata all'utente, include componenti grafici (scritte, immagini...) per visualizzare lo stato del sistema e componenti di input (bottoni, caselle di testo...) per informare il controller sull'input dell'utente.
	</dd>
	<dt>Controller</dt>
	<dd>
		Il Controller fa da ponte tra il Model e la View, si occupa di aggiornarli opportunamente in risposta all'input dell'utente. Nel nostro caso il Controller incapsula anche la logica di aggiornamento dei dati del Model per ogni iterazione della simulazione.
	</dd>
</dl>
Perchè abbiamo scelto MVC?
In cosa ci ha semplificato la vita?

### Descrizione dettagliata delle componenti

Sottocomponenti dei macrocomponenti mvc

### scelte tecnologiche cruciali ai fini architetturali
Se abbiamo usato un qualche strumento che ci aiutasse con la progettazione architetturale, ma credo andremo a braccio.