class Heroi:
    def __init__(self, nome, idade, tipo):
        self.nome = nome
        self.idade = idade
        self.tipo = tipo

    def atacar(self):
        ataque = ""
        if self.tipo == "mago":
            ataque = "usou magia"
        elif self.tipo == "guerreiro":
            ataque = "usou espada"
        elif self.tipo == "monge":
            ataque = "usou artes marciais"
        elif self.tipo == "ninja":
            ataque = "usou shuriken"
        print(f"O {self.tipo} atacou usando {ataque}")


# Exemplo de uso
heroi1 = Heroi("Aragorn", 35, "guerreiro")
heroi2 = Heroi("Gandalf", 1000, "mago")

heroi1.atacar()  # Saída: O guerreiro atacou usando espada
heroi2.atacar()  # Saída: O mago atacou usando magia
