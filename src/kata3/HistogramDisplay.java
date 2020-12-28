/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata3;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 * @author Antonio Miguel Martel
 */
public class HistogramDisplay extends ApplicationFrame{
    
    //Me creas la ventana con su panel y e
    public HistogramDisplay() {
        //Invocamos constructor de la superclase
        super("Histograma");
        //Entonces aqui tenemos el panel que contendrá todo dentro de la ventana
        this.setContentPane(createPanel());
        //Me ajustas todo
        this.pack();
    }
    
    //Creamos el panel
    private JPanel createPanel() {
        //Me crea el panel que tenemos en la transparencia de la practica.
        //Basicamente es lo que me contiene el chart y el dataset
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;
    }
    
    //Creamos histograma
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        //Me creas el chart con su nombre y sus ejes con una orientacion de barras vertical y
        JFreeChart chart = ChartFactory.createBarChart("Histograma", 
                                                        "Dominios de email", 
                                                        "Numero de emails", 
                                                        dataset, 
                                                        PlotOrientation.VERTICAL, 
                                                        false, 
                                                        false, 
                                                        rootPaneCheckingEnabled);
        return chart;
    }
    
    //Creamos conjunto de datos
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(4, "", "ulpgc.es");
        dataset.addValue(1, "", "ull.es");
        dataset.addValue(6, "", "hotmail.com");
        dataset.addValue(12, "", "gmail.com");
        return dataset;
    }
    
    public void execute() {
        this.setVisible(true);
    }
}
