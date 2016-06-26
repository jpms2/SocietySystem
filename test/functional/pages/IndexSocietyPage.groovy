package pages

import geb.Page

/**
 * Created by USER on 21/06/2016.
 */
class IndexSocietyPage extends Page {
    static url = "/SocietySystem/society/index"

    static at = {
        title ==~/Society Listagem/
    }

    boolean gotoSearch(){
        $("input", name: "Search available societies").click()
    }
}
