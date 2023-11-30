function Calculadora() {

        this.display = document.querySelector('.display');
        this.inicia = () => {
            this.cliqueBotoes();
        };

        this.cliqueBotoes = () => {
            document.addEventListener('click', event =>{
                const el = event.target;

                if(el.classList.contains('btn-num')){
                    this.btnParaDisplay(el);
                }

                if(el.classList.contains('btn-clear')){
                    this.clearDisplay();
                }
                
                if(el.classList.contains('btn-del')){
                    this.apagaUm();
                }

                if(el.classList.contains('btn-eq')){
                    this.realizaConta();
                }
                
            })
            
        },
        this.realizaConta = () =>{
            let conta = this.display.value;

            try{
                conta = eval(conta);

                if(!conta) {
                    alert('Conta inválida');
                    return;
                  }
          
                  this.display.value = String(conta);
            }catch(e){
                alert('Conta inválida');
                return;
            }
        },

        this.apagaUm = () => this.display.value = this.display.value.slice(0,-1);
        
        this.clearDisplay = () => this.display.value = '';

        this.btnParaDisplay = el => this.display.value += el.innerText;
        

};

const calculadora = new Calculadora();
calculadora.inicia();

