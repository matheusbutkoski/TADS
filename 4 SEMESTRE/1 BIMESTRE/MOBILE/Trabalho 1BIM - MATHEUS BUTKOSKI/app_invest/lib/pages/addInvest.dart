import 'package:app_invest/repositories/ativo_repository.dart';
import 'package:flutter/material.dart';
import 'package:intl/intl.dart';
import 'package:provider/provider.dart';

import '../models/ativo.dart';
import 'ativoDados.dart';
import 'listaAtivos.dart';

class addInvest extends StatefulWidget {
List<Ativo> ativos;
addInvest({Key? key, required this.ativos}) :super(key: key);
 
  @override
  State<addInvest> createState() => _addInvestState();
   
}

class _addInvestState extends State<addInvest> {
    NumberFormat real = NumberFormat.currency(locale: 'pt_BR', name: 'R\$');
    List<Ativo> selecionadas = [];
    late List<Ativo> aux = widget.ativos;
    List<Ativo> tabela =[];


    appBarDinamica(){
      if(selecionadas.isEmpty){
        return AppBar(
        title: Text('Seus Ativos',
        ),
       
        backgroundColor: Colors.amber,
      );
      }else{
        return AppBar(
          leading: IconButton(icon: Icon(Icons.close), onPressed: (){
            setState(() {
              selecionadas = [];
            });
          },
          ),
          
        title: Text('${selecionadas.length} Selecionadas'),
        backgroundColor: Color.fromARGB(255, 250, 100, 45),
        elevation: 1,
        actions: <Widget>[IconButton(onPressed: (){
          setState(() {
            for(int i =0; i < selecionadas.length; i++){
                selecionadas.remove(selecionadas[i]);
                           
            }
           
          });

        }, icon: Icon(Icons.delete))],        
        );
      }
      
    }

    mostrarDetalhes(Ativo ativo){
      Navigator.push(context, MaterialPageRoute(builder: (context){
      return AtivoDados(ativo: ativo);
      }
      )
      );
    }

  @override
 Widget build(BuildContext context) {
  for(int i=0;i<aux.length; i++){
    setState(() {
      tabela.add(aux[i]);
    });
    
  }
   return Scaffold(
      appBar: appBarDinamica(),     
      body: ListView.separated(itemBuilder:(BuildContext context, int ativo){
        return ListTile(
          shape: RoundedRectangleBorder(borderRadius: BorderRadius.all(Radius.circular(12))),

          leading: SizedBox(
          child: Image.network(tabela[ativo].icone),
          width: 40
            ),

          title: Text(tabela[ativo].nome, style: TextStyle(
            fontSize: 17,
            fontWeight: FontWeight.w500,
          ),),

          trailing: Text(real.format(tabela[ativo].preco)),
      
          selected: selecionadas.contains(tabela[ativo]),

          selectedTileColor: Colors.amber[50],

          onLongPress: (){
            setState(() {
              if(selecionadas.contains(tabela[ativo])){
                selecionadas.remove(tabela[ativo]);
              }else{
                selecionadas.add(tabela[ativo]);
              }          
              
            });         
          },
          onTap: (){
            mostrarDetalhes(tabela[ativo]);
          },


        );
      },
      
      padding: EdgeInsets.all(16), separatorBuilder: (_, ___) => Divider(), itemCount: aux.length), 

      floatingActionButton: FloatingActionButton(
        onPressed:() {
          Navigator.push(context, MaterialPageRoute(builder: (context){
        return ListaAtivos();
      }
      )
      );
      },
      child: Icon(Icons.add),
      backgroundColor: Colors.amber,
      hoverColor: const Color.fromARGB(255, 255, 191, 0),
      ),

    );
  }
}