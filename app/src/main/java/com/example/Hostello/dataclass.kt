package com.example.Hostello

class dataclass {
    var dataTitle: String? = null
    var dataDesc: String? = null
    var dataPriority: String? = null
    var dataImage: String? = null
    constructor(dataTitle: String?, dataDesc: String?, dataPriority: String?, dataImage: String?){
        this.dataTitle = dataTitle
        this.dataDesc = dataDesc
        this.dataPriority = dataPriority
        this.dataImage = dataImage
    }
    constructor()
    {}
}
