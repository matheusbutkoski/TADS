import 'package:app_invest/pages/addInvest.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:intl/intl.dart';
import '../models/ativo.dart';

class formInvest extends StatefulWidget {
  Ativo ativo;
  formInvest({Key? key, required this.ativo}) :super(key: key);

  @override
  State<formInvest> createState() => _formInvestState();
}


class _formInvestState extends State<formInvest> {
  final _form = GlobalKey<FormState>();
  final _valor = TextEditingController();
  final _data = TextEditingController();
  double qtd = 0;
  double valor = 0;
   NumberFormat real = NumberFormat.currency(locale: 'pt_BR', name: 'R\$');

  Widget fieldValor(){
    return TextFormField(
          controller: _valor,
          style: TextStyle(
            fontSize: 22
          ),
          decoration: InputDecoration(
            border: OutlineInputBorder(),
            labelText: "Valor",
            prefixIcon: Icon(Icons.monetization_on_outlined),
            suffix: Text('reais', style: TextStyle(fontSize: 14),)
          ),
          keyboardType: TextInputType.number,
          inputFormatters: [
            FilteringTextInputFormatter.digitsOnly
          ],
          validator: (value){
            if(value!.isEmpty){
              return 'Informe o valor da compra';
            } else if(double.parse(value) < 100){
              return 'Valor minimo = R\$ 100,00';
            }
              return null;
          },
          onChanged: (value){
            setState(() {
              qtd = (value.isEmpty)
              ? 0
              : 
              double.parse (value) / widget.ativo.preco;             

            });
          },
        );
  }

  fieldData(){
    return TextField(
      controller: _data,
      style: TextStyle(
        fontSize: 22
      ),
      decoration: InputDecoration(
        border: OutlineInputBorder(),
        labelText: 'Data da Compra',
        prefixIcon: Icon(Icons.calendar_month),      
      ),
      keyboardType: TextInputType.none,
      inputFormatters: [
            FilteringTextInputFormatter.digitsOnly
          ],


          onTap: ()async{
            DateTime? dataEscolhida = await showDatePicker(
              context: context,
               initialDate: DateTime.now(),
                firstDate: DateTime(2010),
                 lastDate: DateTime.now());

                 if(dataEscolhida != null){
                  setState(() {
                    _data.text = DateFormat('dd/MM/yyyy').format(dataEscolhida);
                  });
                 }
           
          },
          
    );
  }

  saveAtivo(List<Ativo> atvs){
    Navigator.push(context, MaterialPageRoute(builder: (context){
      return addInvest(ativos: atvs);
      }
      )
      );
  }
  @override
  Widget build(BuildContext context) {
    List <Ativo> ativos = [];
    return Scaffold(
      appBar: AppBar(
        title: Text("Preencha os campos"),
        backgroundColor: Colors.amber,
      ),

      body: Padding(padding: EdgeInsets.all(24),
      child: Column(
        children: [
          Padding(padding: EdgeInsets.only(bottom: 24),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              crossAxisAlignment: CrossAxisAlignment.center,
            children: [ 
              SizedBox(
                child: Image.network(widget.ativo.icone),
                width: 50,
              ),

              Container(width: 10),

              Text(
                real.format(widget.ativo.preco),
                style: TextStyle(
                  fontSize: 26,
                  fontWeight: FontWeight.w600,
                ),
              )
            ],
          )
          ),
          (qtd > 0)
        ? SizedBox(
          width: MediaQuery.of(context).size.width,
          child: Container(
            child: Text(
              '$qtd ${widget.ativo.sigla}', style: TextStyle(
                fontSize: 20,
                color: Color.fromARGB(255, 16, 150, 136),
              ),
            ),
            margin: EdgeInsets.only(bottom: 24),
            alignment: Alignment.center,
          ),
        )
        : Container(
          margin: EdgeInsets.only(bottom: 24),
        ),
        
        Form(
          key: _form,
          child: Column(
            children: [
              fieldValor(),
              SizedBox(height: 20),
              fieldData(),
              SizedBox(height: 20),
              Container(
                height: 60,
                decoration: BoxDecoration(
                  color: Colors.amber,
                  borderRadius: BorderRadius.all(Radius.circular(5))
                ),
                child: SizedBox.expand(
                child: TextButton(
                  onPressed: (){    
                    ativos.add(widget.ativo);    
                    saveAtivo(ativos);
                  },
                  child: Text("Salvar", style: TextStyle(
                    fontSize: 26,
                    fontWeight: FontWeight.w600,
                    color: Colors.black
                  ),),
                ),
              ),
              )
            ],
          ),
        )
        ],
      ),
      )    
    );
  }
}