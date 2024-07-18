package Entities;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.jar.Attributes;

public class Worker {
    private String Name;
    private Double Salary;
    private WorkerLevel Level;

    private List<HourContract> contracts = new ArrayList<>();
    private Departament Departament;

    public Worker() {
    }

    // O contracts não vai estar dentro de um construtor pois ele recebe muitos valores,
    // então é importante seguir o padrão de inicializa-lo com zero. Isso serve para todos Exemplos.
    public Worker(String name, Double salary, WorkerLevel level, Departament departament) {
        this.Name = name;
        this.Salary = salary;
        this.Level = level;
        this.Departament = departament;
    }

    // get and set of my contracts
    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }

    public void addContracts(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContracts(HourContract contract) {
        contracts.remove(contract);
    }

    //Análise de contrato.
    public double income(Integer yeas, Integer month) {
        double sum = Salary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1+ cal.get(Calendar.MONTH);
            if (yeas == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}

