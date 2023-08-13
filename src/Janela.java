import javax.swing.*;
import java.awt.*;//importando tudo
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame implements ActionListener {
    private JButton[] numeros, operacoes;
    private JPanel painel, painel2;
    private JTextField resultados;

    Janela() {

        this.setSize(300, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setTitle("Calculadora");
        painel = new JPanel();
        painel2 = new JPanel();
        resultados = new JTextField(30);
        resultados.setEditable(false);
        resultados.setHorizontalAlignment(JTextField.CENTER);
        numeros = new JButton[10];
        this.setLayout(new GridLayout(3, 1));

        painel.setLayout(new GridLayout(2, 3, 0, 0));
        painel2.setLayout(new GridLayout(2, 3, 0, 0));
        for (int i = 0; i < 10; i++) {
            numeros[i] = new JButton(String.valueOf(i));
            numeros[i].addActionListener(this);
        }
        operacoes = new JButton[6];
        painel.add(numeros[7]);
        painel.add(numeros[8]);
        painel.add(numeros[9]);
        painel.add(operacoes[0] = new JButton("%"));
        painel.add(numeros[4]);
        painel.add(numeros[5]);
        painel.add(numeros[6]);
        painel.add(operacoes[1] = new JButton("*"));
        painel2.add(numeros[1]);
        painel2.add(numeros[2]);
        painel2.add(numeros[3]);
        painel2.add(operacoes[2] = new JButton("-"));
        painel2.add(numeros[0]);
        painel2.add(operacoes[3] = new JButton("C"));
        painel2.add(operacoes[5] = new JButton("="));
        painel2.add(operacoes[4] = new JButton("+"));
        operacoes[0].addActionListener(this);
        operacoes[1].addActionListener(this);
        operacoes[2].addActionListener(this);
        operacoes[3].addActionListener(this);
        operacoes[4].addActionListener(this);
        operacoes[5].addActionListener(this);
        this.add(resultados);
        this.add(painel);
        this.add(painel2);
        this.setVisible(true);
        numeros[1].addActionListener(null);
    }

    double valor1, valor2;
    int operacao = 6, valorParaRetirar = 0;

    double calcular(double valor, double valor2, int operacao) { // calculadora
        if (operacao == 1) {
            return (valor + valor2);
        }
        if (operacao == 2) {
            return (valor - valor2);
        }
        if (operacao == 3) {
            return (valor * valor2);
        }
        if (operacao == 4) {
            return (valor / valor2);
        } else {
            return 0;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == operacoes[5]) { // =
            resultados.setText(Double.toString(calcular(valor1, valor2, operacao)));
            operacao = 6;
            valorParaRetirar = 0;
        } else if (e.getSource() == numeros[0]) {
            resultados.setText(resultados.getText() + "0");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;

            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida
            }
        } else if (e.getSource() == numeros[1]) {
            resultados.setText(resultados.getText() + "1");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida

            }
        } else if (e.getSource() == numeros[2]) {
            resultados.setText(resultados.getText() + "2");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida
            }
        } else if (e.getSource() == numeros[3]) {
            resultados.setText(resultados.getText() + "3");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida

            }

        } else if (e.getSource() == numeros[4]) {
            resultados.setText(resultados.getText() + "4");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida
            }

        } else if (e.getSource() == numeros[5]) {
            resultados.setText(resultados.getText() + "5");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida
            }

        } else if (e.getSource() == numeros[6]) {

            resultados.setText(resultados.getText() + "6");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida
            }

        } else if (e.getSource() == numeros[7]) {
            resultados.setText(resultados.getText() + "7");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida
            }

        } else if (e.getSource() == numeros[8]) {
            resultados.setText(resultados.getText() + "8");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida
            }

        } else if (e.getSource() == numeros[9]) {
            resultados.setText(resultados.getText() + "9");
            if (operacao == 6) {
                valor1 = Double.parseDouble(resultados.getText());
                valorParaRetirar++;
            } else {
                valor2 = Double.parseDouble(resultados.getText().substring(valorParaRetirar));// usando o sustring pra
                                                                                              // retirar a primeira
                                                                                              // expressao e adicionar o
                                                                                              // valor 2 apenas oque for
                                                                                              // digitado depois da
                                                                                              // operação for escolhida
            }

        } else if (e.getSource() == operacoes[0]) {
            resultados.setText(resultados.getText() + "%");
            valorParaRetirar++;
            operacao = 4;
        } else if (e.getSource() == operacoes[1]) {
            resultados.setText(resultados.getText() + "*");
            valorParaRetirar++;
            operacao = 3;
        } else if (e.getSource() == operacoes[2]) {
            resultados.setText(resultados.getText() + "-");
            valorParaRetirar++;
            operacao = 2;
        } else if (e.getSource() == operacoes[4]) {
            resultados.setText(resultados.getText() + "+");
            valorParaRetirar++;
            operacao = 1;
        } else if (e.getSource() == operacoes[3]) {
            resultados.setText("");
        }

    }

}