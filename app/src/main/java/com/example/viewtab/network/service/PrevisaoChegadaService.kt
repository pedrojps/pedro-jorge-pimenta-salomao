package com.example.viewtab.network.service

import com.example.viewtab.network.model.Linha
import com.example.viewtab.network.model.Previsao
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PrevisaoChegadaService {

    @GET("Previsao/Parada")
    fun getParadaPrecisao( @Query("codigoParada") code: Long): Single<Response<Previsao?>?>?

}