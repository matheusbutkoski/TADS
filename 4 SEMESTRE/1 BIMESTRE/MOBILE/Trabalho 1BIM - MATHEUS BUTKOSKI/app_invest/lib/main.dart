import 'package:app_invest/pages/home.dart';
import 'package:app_invest/pages/login.dart';
import 'package:app_invest/repositories/ativo_repository.dart';

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';


void main() async{
  runApp(
    MultiProvider(providers: [
       ChangeNotifierProvider(create: (context)=> AtivoRepository()),
       
    ],
    child: MyApp())
   
    
    );
}

class MyApp extends StatelessWidget{ 
    @override
    Widget build(BuildContext context) {
      return MaterialApp(
        title: 'App Investimentos',
        theme: ThemeData(
          primarySwatch: Colors.deepOrange,
        ),
        home: Login(),
        );
       
    }
  }

