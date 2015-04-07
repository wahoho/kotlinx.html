package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class B(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("b", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class BASE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("base", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var href : String
        get()  = attributeStringf30f39f0.get(this, "href")
        set(newValue) {attributeStringf30f39f0.set(this, "href", newValue)}

    var target : String
        get()  = attributeStringf30f39f0.get(this, "target")
        set(newValue) {attributeStringf30f39f0.set(this, "target", newValue)}


}

public class BDI(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("bdi", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class BDO(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("bdo", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class BLOCKQUOTE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("blockquote", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var cite : String
        get()  = attributeStringf30f39f0.get(this, "cite")
        set(newValue) {attributeStringf30f39f0.set(this, "cite", newValue)}


}

public class BODY(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("body", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var onResize : String
        get()  = attributeStringOnResize80ecc161.get(this, "onresize")
        set(newValue) {attributeStringOnResize80ecc161.set(this, "onresize", newValue)}

    var onPopstate : String
        get()  = attributeStringOnPopstatebc4fd5cd.get(this, "onpopstate")
        set(newValue) {attributeStringOnPopstatebc4fd5cd.set(this, "onpopstate", newValue)}

    var onBeforeprint : String
        get()  = attributeStringOnBeforeprint6be0655d.get(this, "onbeforeprint")
        set(newValue) {attributeStringOnBeforeprint6be0655d.set(this, "onbeforeprint", newValue)}

    var onHashChange : String
        get()  = attributeStringOnHashChange85a50f6b.get(this, "onhashchange")
        set(newValue) {attributeStringOnHashChange85a50f6b.set(this, "onhashchange", newValue)}

    var onBeforeunLoad : String
        get()  = attributeStringOnBeforeunLoad9cb4b4ab.get(this, "onbeforeunload")
        set(newValue) {attributeStringOnBeforeunLoad9cb4b4ab.set(this, "onbeforeunload", newValue)}

    var onUndo : String
        get()  = attributeStringOnUndob6be1951.get(this, "onundo")
        set(newValue) {attributeStringOnUndob6be1951.set(this, "onundo", newValue)}

    var onOffline : String
        get()  = attributeStringOnOffline832eb132.get(this, "onoffline")
        set(newValue) {attributeStringOnOffline832eb132.set(this, "onoffline", newValue)}

    var onUnLoad : String
        get()  = attributeStringOnUnLoad868703ac.get(this, "onunload")
        set(newValue) {attributeStringOnUnLoad868703ac.set(this, "onunload", newValue)}

    var onStorage : String
        get()  = attributeStringOnStorage6f2ce5ca.get(this, "onstorage")
        set(newValue) {attributeStringOnStorage6f2ce5ca.set(this, "onstorage", newValue)}

    var onRedo : String
        get()  = attributeStringOnRedob6bc9a6b.get(this, "onredo")
        set(newValue) {attributeStringOnRedob6bc9a6b.set(this, "onredo", newValue)}

    var onMessage : String
        get()  = attributeStringOnMessage1867a356.get(this, "onmessage")
        set(newValue) {attributeStringOnMessage1867a356.set(this, "onmessage", newValue)}

    var onAfterprint : String
        get()  = attributeStringOnAfterprinta038b37e.get(this, "onafterprint")
        set(newValue) {attributeStringOnAfterprinta038b37e.set(this, "onafterprint", newValue)}

    var onOnline : String
        get()  = attributeStringOnOnline7c49db00.get(this, "ononline")
        set(newValue) {attributeStringOnOnline7c49db00.set(this, "ononline", newValue)}


}

public class BR(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("br", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class BUTTON(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("button", consumer, initialAttributes), AServerAttributeGroupFacade, CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade, ButtonServerAttributeGroupFacade {
    var formMethod : FormMethod
        get()  = attributeFormMethodFormMethodFormMethodValues7a953fbe.get(this, "formmethod")
        set(newValue) {attributeFormMethodFormMethodFormMethodValues7a953fbe.set(this, "formmethod", newValue)}

    var formNovalidate : Boolean
        get()  = attributeBooleanFormNovalidateFormNovalidateEmpty2caba9f7.get(this, "formnovalidate")
        set(newValue) {attributeBooleanFormNovalidateFormNovalidateEmpty2caba9f7.set(this, "formnovalidate", newValue)}

    var autoFocus : Boolean
        get()  = attributeBooleanAutoFocusAutoFocusEmptya5698437.get(this, "autofocus")
        set(newValue) {attributeBooleanAutoFocusAutoFocusEmptya5698437.set(this, "autofocus", newValue)}

    var value : String
        get()  = attributeStringf30f39f0.get(this, "value")
        set(newValue) {attributeStringf30f39f0.set(this, "value", newValue)}

    var formEncType : FormEncType
        get()  = attributeFormEncTypeFormEncTypeFormEncTypeValues5f514f53.get(this, "formenctype")
        set(newValue) {attributeFormEncTypeFormEncTypeFormEncTypeValues5f514f53.set(this, "formenctype", newValue)}

    var formAction : String
        get()  = attributeStringFormAction57b2208.get(this, "formaction")
        set(newValue) {attributeStringFormAction57b2208.set(this, "formaction", newValue)}

    var form : String
        get()  = attributeStringf30f39f0.get(this, "form")
        set(newValue) {attributeStringf30f39f0.set(this, "form", newValue)}

    var name : String
        get()  = attributeStringf30f39f0.get(this, "name")
        set(newValue) {attributeStringf30f39f0.set(this, "name", newValue)}

    var formTarget : String
        get()  = attributeStringFormTarget25ca1563.get(this, "formtarget")
        set(newValue) {attributeStringFormTarget25ca1563.set(this, "formtarget", newValue)}

    var type : String
        get()  = attributeStringf30f39f0.get(this, "type")
        set(newValue) {attributeStringf30f39f0.set(this, "type", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanDisabledDisabledEmptyf8f91d7.get(this, "disabled")
        set(newValue) {attributeBooleanDisabledDisabledEmptyf8f91d7.set(this, "disabled", newValue)}


}
