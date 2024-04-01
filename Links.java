package EndPoints;

public class Links {

    public static String  Base_url ="https://api.trello.com";
    public  static  String key ="4d912103259f599d321eb60e0ceff942";
    public  static  String token ="ATTA056432fa9f3ae882f30d00726d8cab59e5952e62923cc75ce35205c128875c8f9F9D2055";

    public static String  email ="maikhalil560@gmail.com";

    public static String createBoard =Base_url+"/1/boards/?name={name}&key="+key+"&token="+token;
    public static  String getBoard =Base_url+"/1/boards/{idBoard}?key="+ key +"&token="+token  ;

    // list
    public static  String createList = Base_url+"/1/lists?name={listName}&idBoard={idBoard}&key="+key+"&token="+token ;

    //cards
    public static String createCard =Base_url+"/1/cards?idList={listId}&key="+key+"&token="+token+"&name={cardName}";

    public static String CreateCheckList =Base_url+"/1/checklists?idCard={MyCardId}&key="+key+"&token="+token+"&name={checkList}";
    //labels
    public static String createLabel =Base_url+"/1/boards/{idBoard}/labels?name={name}&color=red&key="+key+"&token="+token ;

    public static String DeleteLabel =Base_url+"/1/labels/{idLabel}?key="+key+"&token="+token;
}
