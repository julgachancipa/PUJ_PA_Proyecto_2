package utils;

import java.io.IOException;

public class RunPython {
    public static void RunScript(String file, String columna) throws IOException
    {
        String[] cmd = {
            "/home/emma/miniconda3/envs/aux/bin/python",
            "python_scripts/pie_plot.py",
            file,
            columna,
        };
        Runtime.getRuntime().exec(cmd);
        System.out.println("El comando se ha ejecutado");
    }
}
