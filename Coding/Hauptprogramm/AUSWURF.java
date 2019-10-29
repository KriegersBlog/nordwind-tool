//AUSWURF
//ButtonSubmitActionPerformed
String table = list_tables.getSelectedValue().toString();
    if(table.equals("artikel") && check_numberfields(panel_artikel)){
      check_numberfields(panel_artikel);
      int[] ints = {
        numberfield_artikelnr.getInt(), numberfield_lieferantennr.getInt(), 
        numberfield_kategorienr.getInt(), numberfield_lagerbestand.getInt(),
        numberfield_bestellteEinheiten.getInt(), numberfield_mindestbestand.getInt()
      };
      String[] strings = {
        "", textfield_liefereinheit.getText()
        };
      double[] doubles = {
        numberfield_einzelpreis.getDouble()
      };
      boolean[] bools = {
      checkbox_auslaufartikel.isSelected()
      };
      dbQuery.createRecord(table, strings, ints, doubles, bools);
    }
    else{
      //ERROR
    }
    
    public boolean check_numberfields(Container table){
    int empty_counter = 0;
    
    for (Component c: table.getComponents()) {
      if(c instanceof JNumberField){
        JNumberField nf = (JNumberField) c;
        if(nf.getText().equals("")){
          nf.setText("0");    
        }
        if(!nf.isNumeric()){
          empty_counter++;
        }
      }
    }
    if(empty_counter>0){
      return false;
    }
    else {
      return true;
    }
  }
