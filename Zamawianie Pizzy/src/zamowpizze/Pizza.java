package zamowpizze;

class Pizza {
   
    private String ciasto;
    private String sos;
    private String zestawSkladnikow;

    public void setCiasto(String ciasto) {
        if (ciasto != null)
            this.ciasto = ciasto;
        else
            this.ciasto = "średnie";
    }
    
    public void setSos(String sos) {
        this.sos = sos;
    }
    
    public void setZestawSkladnikow(String zestawSkladnikow) {
        this.zestawSkladnikow = zestawSkladnikow;
    }

    public String toString() {
        StringBuilder sb= new StringBuilder();

            sb.append("\nCiasto: ");
            sb.append(ciasto);
            sb.append(" ");

        if (sos != null) {
            sb.append("\nSos: ");
            sb.append(sos);
            sb.append(" ");

        }
        if (zestawSkladnikow != null) {
            sb.append("\nZestaw składników: ");
            sb.append(zestawSkladnikow);
            sb.append(" ");

        }
        
        return sb.toString();
    }
}
