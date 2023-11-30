
import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart';

class DB {

  DB._();

  static final DB instance =DB._();

  static Database? _database;

  get database async {
    if(_database != null) return _database;
    return await _initDatabase();
  }

  _initDatabase() async{
    return await openDatabase(
      join(await getDatabasesPath(),'ativos.db'),
      version: 1,
    
    );   
  }
  
}