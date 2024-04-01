package TestCases;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

    public static String my_idBoard;
    public static String listId1;
    public static String listId2;
    public static String cardId1;
    public static String cardId2;
    public static String LabelId;
    public static String LabelId2;
    public static  String  CheckList1;
    public static  String  CheckList2;

    @Test(priority = 0)
    public void CreateBoard() {
        Response createBoard_response = EndPoints.EndPoints1.createBoard("RestBoard");
        createBoard_response.prettyPrint();
        Assert.assertEquals(createBoard_response.statusCode(), 200);
        my_idBoard = createBoard_response.body().jsonPath().get("id");
    }

    @Test(priority = 1)
    public void getBoard() {
        Response getBoard_response = EndPoints.EndPoints1.getBoards(my_idBoard);
        getBoard_response.prettyPrint();
        Assert.assertEquals(getBoard_response.statusCode(), 200);
    }

    @Test(priority = 2)
    public void createList() {
        Response createlist1_response = EndPoints.EndPoints1.createList("Restlist1", my_idBoard);
        createlist1_response.prettyPrint();
        Assert.assertEquals(createlist1_response.statusCode(), 200);
        listId1 = createlist1_response.body().jsonPath().get("id");
    }

    @Test(priority = 3)
    public void createList2() {
        Response createlist2_response = EndPoints.EndPoints1.createList("RestList2", my_idBoard);
        createlist2_response.prettyPrint();
        listId2 = createlist2_response.body().jsonPath().get("id");
        Assert.assertEquals(createlist2_response.statusCode(), 200);
    }

    @Test(priority = 4)
    public void createCard1() {
        Response cardRes1_response = EndPoints.EndPoints1.createCard(listId1, "Restcard1");
        cardId1 = cardRes1_response.body().jsonPath().get("id");
        cardRes1_response.prettyPrint();
        Assert.assertEquals(cardRes1_response.statusCode(), 200);
    }

    @Test(priority = 5)
    public void createCard2() {
        Response cardRes2_response = EndPoints.EndPoints1.createCard(listId2, "Restcard2");
        cardId2 = cardRes2_response.body().jsonPath().get("id");
        cardRes2_response.prettyPrint();
        Assert.assertEquals(cardRes2_response.statusCode(), 200);
    }
    @Test(priority = 6)
    public void createChecklist() {
        Response checklist1_response;
        checklist1_response = EndPoints.EndPoints1.CreateCheckList(cardId1, "checklist1");
        CheckList1 = checklist1_response.body().jsonPath().get("id");
        checklist1_response.prettyPrint();
        Assert.assertEquals(checklist1_response.statusCode(), 200);
    }
    @Test(priority = 7)
    public void createChecklist2() {
        Response checklist2_response = EndPoints.EndPoints1.CreateCheckList(cardId2, "checklist2");
        CheckList2 = checklist2_response.body().jsonPath().get("id");
        checklist2_response.prettyPrint();
        Assert.assertEquals(checklist2_response.statusCode(), 200);
    }

    @Test(priority = 8)
    public void createLabel() {
        Response labelRest_response = EndPoints.EndPoints1.Createlabel(my_idBoard, "lable1");
        LabelId = labelRest_response.body().jsonPath().get("id");
        labelRest_response.prettyPrint();
        Assert.assertEquals(labelRest_response.statusCode(), 200);
    }

    @Test(priority = 9)
    public void createLabel2() {
        Response labelRest_response2 = EndPoints.EndPoints1.Createlabel(my_idBoard, "lable2");
        LabelId2 = labelRest_response2.body().jsonPath().get("id");
        labelRest_response2.prettyPrint();
        Assert.assertEquals(labelRest_response2.statusCode(), 200);
    }
    @Test(priority = 10)
    public void deleteLabel() {
        Response labelRestdelete_response = EndPoints.EndPoints1.DeleteLabel(LabelId);
        labelRestdelete_response.prettyPrint();
        Assert.assertEquals(labelRestdelete_response.statusCode(), 200);
    }
}




