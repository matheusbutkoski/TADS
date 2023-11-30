
import 'package:app_invest/pages/config.dart';
import 'package:fl_chart/fl_chart.dart';
import 'package:flutter/material.dart';

import '../models/ativo.dart';
import 'addInvest.dart';
import 'conta.dart';

class Home extends StatelessWidget {
  const Home({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        drawer: Drawer(
          child: ListView(
            children: [
              UserAccountsDrawerHeader(
                accountName: Text("Admin"),
                accountEmail: Text("admin@admin.com"),
                decoration: BoxDecoration(color: Colors.amber),
                
                ),
                ListTile(
                    leading: Icon(Icons.wallet, color: Colors.black,),
                    title: Text("Carteira"),
                    trailing: Icon(Icons.arrow_forward),
                    onTap: (){
                      Navigator.push(context, MaterialPageRoute(builder: (context){
                        return Home();
                          }
                        )
                      );
                    }
           ),
                ListTile(
                    leading: Icon(Icons.analytics, color: Colors.black,),
                    title: Text("Gerenciar Ativos"),
                    trailing: Icon(Icons.arrow_forward),
                    onTap: (){
                      Navigator.push(context, MaterialPageRoute(builder: (context){
                        return addInvest(ativos: []);
                          }
                        )
                      );
                    }
           ),

           ListTile(
                    leading: Icon(Icons.person, color: Colors.black,),
                    title: Text("Conta"),
                    trailing: Icon(Icons.arrow_forward),
                    onTap: (){
                      Navigator.push(context, MaterialPageRoute(builder: (context){
                        return Conta();
                          }
                        )
                      );
                    }
           ),
           ListTile(
                    leading: Icon(Icons.settings, color: Colors.black,),
                    title: Text("Configurações"),
                    trailing: Icon(Icons.arrow_forward),
                    onTap: (){
                      Navigator.push(context, MaterialPageRoute(builder: (context){
                        return Config();
                          }
                        )
                      );
                    }
           ),

           
            ],
          ),
        ),
        appBar: AppBar(
          backgroundColor: Colors.amber,
          title: const Text("Bem-Vindo"),
        ),
        body: const UserWallet(),
        
      ),
    );
  }
}

class UserWallet extends StatelessWidget {
  const UserWallet({super.key});
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SingleChildScrollView(
        padding: EdgeInsets.only(top: 30),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Padding(padding: EdgeInsets.only(top: 48, bottom: 8),
            child: Text(
              'Valor da Carteira',
              style: TextStyle(
                fontSize: 18,
                fontWeight: FontWeight.bold
              ),
            ),      
            ),
            Text(
              'R\$ 10.000,00',
              style: TextStyle(
                fontSize: 35,
                fontWeight: FontWeight.w700,
                letterSpacing: -1.5,
              ),        
            ),

           Stack(
            alignment: Alignment.center,
            children: [
              AspectRatio(aspectRatio: 1,
              child: PieChart(
                PieChartData(
                  sectionsSpace: 5,
                  centerSpaceRadius: 110,
                  sections: List.generate(1, (index) => 
                  PieChartSectionData(
                    color: Colors.amber,
                    value: 50,
                    title: "BTC",
                  )
                  )                  
                )
              ),
              ),
            ],
            ),
          ],
        ),
      )
      
    ); 
  }
}



