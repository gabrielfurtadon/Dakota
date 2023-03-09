class Board extends HTMLElement{
    constructor(){
        super();
    }

    connectedCallback(){
        this.innerHTML = `
            <style>
                div {
                    display:flex;
                    background-color: #474747;
                }
            </style>

            <div>
                <h2>Teste</h2>
            </div>
            `;
    }
}

customElements.define('board', Board)
    