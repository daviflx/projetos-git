# Aula de Git e GitHub

## Comandos Git

- git --version: Retorna a versão do Git instalado.
- git clone URL: Cria cópia local de um repositório remoto.
- git add. : Adiciona arquivos/modificações realizados no próximo commit.
- git commit -m "...": Criar um commit com as alterações feitas.
- git log --oneline -n 2 : Retornar os dois últimos commits mais recentes de forma resumida.
- git push origin main: envia seus commits do repositório local para o remoto (branch 'main').
- git pull origin main: Baixa os commits do repositório remoto para o local (branch 'main').

## Fluxo de trabalho
1. Criar nova branch
2. Aplicar mudanças com commits atômicos
3. Enviar commits para o repositório remoto
4. Abrir _pull request_
5. Indicar revisores
6. Após divisaõ, dar um merge.