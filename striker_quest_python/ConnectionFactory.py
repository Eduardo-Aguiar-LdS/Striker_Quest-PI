import mysql.connector

# Credenciais do banco de dados
# Conectar ao banco de dados
conexao = mysql.connector.connect(
  user= 'avnadmin',
  password= 'AVNS_DJ4ArJCcuL6fQgn2jdS',
  host = 'mysql-3077d70b-poo-imt-ap10-2024.k.aivencloud.com',
  database = 'striker_quest',
  port = 19862
)

# Criar um cursor
cursor = conexao.cursor()

# Executar uma consulta SQL
cursor.execute("SELECT * FROM Jogador")

# Obter os resultados
results = cursor.fetchall()

# Imprimir os resultados
for row in results:
  print(row)

# Fechar o cursor e a conexão
cursor.close()
conexao.close()