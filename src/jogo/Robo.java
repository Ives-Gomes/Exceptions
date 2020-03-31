package jogo;

public class Robo {
    protected String cor;
    protected Integer x;
    protected Integer y;
    
    public Robo(String cor){
        this.cor = cor;
        this.x = 0;
        this.y = 0;
    }
    public String GetCor(){
        return this.cor;
    }
    public void SetCor(String cor){
        this.cor = cor;
    }
    public Integer GetX(){
        return this.x;
    }
    public void SetX(Integer x){
        this.x = x;
    }
    public Integer GetY(){
        return this.y;
    }
    public void SetY(Integer y){
        this.y = y;
    }
    
    public String mover(String posicao){
        try{
        if("down".equals(posicao)){
            if(y == 4){
                throw new MovimentoInvalidoException(x, y);
            }
            else if(y < 5){
            y++;
            }
        }    
        else if("up".equals(posicao)){
           if(y == 0 || y > 4){
               throw new MovimentoInvalidoException(x, y);
           }else if(y > 0){
               y--;
           }
        }else if("right".equals(posicao)){
            if(x == 4){
                throw new MovimentoInvalidoException(x, y);
            }else if(x < 5){
                x++;
            }
        }
        else if("left".equals(posicao)){
           if(x == 0 || x > 4){
               throw new MovimentoInvalidoException(x, y);
           }else if(x > 0){
               x--;
           }
        }
        } catch (MovimentoInvalidoException ex) {
            System.out.println("Campos negativos são inválidos. Movimento não executado!");
        }
        return "O robo está na posição [" + x + "," + y + "]";
    }
    public String mover(Integer opcao){
        try{
        /*
        1 - up
        2 - down
        3 - right
        4 - left
        */
        if(opcao == 2){
            if(y == 4){
                throw new MovimentoInvalidoException(x, y);
            }
            else if(y < 5){
            y++;
            }
        }    
        else if(opcao == 1){
           if(y == 0 || y > 4){
               throw new MovimentoInvalidoException(x, y);
           }else if(y > 0){
               y--;
           }
        }else if(opcao == 3){
            if(x == 4){
                throw new MovimentoInvalidoException(x, y);
            }else if(x < 5){
                x++;
            }
        }
        else if(opcao == 4){
           if(x == 0 || x > 4){
               throw new MovimentoInvalidoException(x, y);
           }else if(x > 0){
               x--;
           }
        }
        } catch (MovimentoInvalidoException ex) {
            System.out.println("Posições que ultrapassam o tamanho do campo são inválidos. Movimento não executado!");
        }
        return "O robo " + this.cor + " está na posição [" + this.x + "," + this.y + "]";
    }
    public boolean encontrouAlimento(Integer x, Integer y){
        boolean encontrouAlimento = false;
        if(this.x == x && this.y == y){
            encontrouAlimento = true;
            return encontrouAlimento;
        }else{
            return encontrouAlimento;
        }
    }
}