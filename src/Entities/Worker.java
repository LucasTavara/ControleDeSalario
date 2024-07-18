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

    private Departament Departament;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker() {
    }

    // O contracts não vai estar dentro de um construtor pois ele recebe muitos valores,
    // então é importante seguir o padrão de inicializa-lo com zero. Isso serve para todos Exemplos.
    public Worker(String name, Double Salary, WorkerLevel level, Departament departament) {
        this.Name = name;
        this.Salary = Salary;
        this.Level = level;
        this.Departament = departament;
    }

    // get and set

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        this.Salary = salary;
    }

    public WorkerLevel getLevel() {
        return Level;
    }

    public void setLevel(WorkerLevel level) {
        this.Level = level;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Entities.Departament getDepartament() {
        return Departament;
    }

    public void setDepartament(Entities.Departament departament) {
        this.Departament = departament;
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
    public double income(int year, int month) {
        double sum = Salary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.getTime();
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1+ cal.get(Calendar.MONTH);
            //condicao
            if (year == c_year && month == c_month) {

                sum += c.totalValue();
            }
        }
        return sum;
    }
}

