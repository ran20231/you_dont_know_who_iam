package com.forsale.app.datalayer.network.adapters;

import com.forsale.app.datalayer.network.errorhandling.ErrorMapper;
import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
import com.forsale.app.datalayer.network.errorhandling.errorserializer.ErrorModelSerializer;
import kotlin.jvm.internal.o;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.z0;
import retrofit2.b;
import retrofit2.d;
import retrofit2.w;
/* compiled from: ResultCallAdapter.kt */
/* loaded from: classes2.dex */
public final class ResultCallAdapter<T> implements b<ForSaleDataResult<? extends T>> {
    public static final int $stable = 8;
    private final b<T> delegate;
    private final ErrorMapper errorMapper;
    private final ErrorModelSerializer errorModelSerializer;

    public ResultCallAdapter(b<T> delegate, ErrorModelSerializer errorModelSerializer, ErrorMapper errorMapper) {
        o.i(delegate, "delegate");
        o.i(errorModelSerializer, "errorModelSerializer");
        o.i(errorMapper, "errorMapper");
        this.delegate = delegate;
        this.errorModelSerializer = errorModelSerializer;
        this.errorMapper = errorMapper;
    }

    @Override // retrofit2.b
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // retrofit2.b
    public void enqueue(final d<ForSaleDataResult<T>> callback) {
        o.i(callback, "callback");
        this.delegate.enqueue(new d<T>(this) { // from class: com.forsale.app.datalayer.network.adapters.ResultCallAdapter$enqueue$1
            final /* synthetic */ ResultCallAdapter<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // retrofit2.d
            public void onFailure(b<T> call, Throwable t11) {
                ErrorMapper errorMapper;
                o.i(call, "call");
                o.i(t11, "t");
                ResultCallAdapter<T> resultCallAdapter = this.this$0;
                errorMapper = ((ResultCallAdapter) resultCallAdapter).errorMapper;
                callback.onResponse(resultCallAdapter, w.h(errorMapper.mapNetworkError(t11)));
            }

            @Override // retrofit2.d
            public void onResponse(b<T> call, w<T> response) {
                ErrorMapper errorMapper;
                ErrorModelSerializer errorModelSerializer;
                String str;
                ForSaleDataResult<T> mapHttpError;
                o.i(call, "call");
                o.i(response, "response");
                if (!response.e()) {
                    errorMapper = ((ResultCallAdapter) this.this$0).errorMapper;
                    errorModelSerializer = ((ResultCallAdapter) this.this$0).errorModelSerializer;
                    int b11 = response.b();
                    ResponseBody d11 = response.d();
                    if (d11 != null) {
                        str = d11.string();
                    } else {
                        str = null;
                    }
                    mapHttpError = errorMapper.mapHttpError(errorModelSerializer.serialize(b11, str));
                } else {
                    T a11 = response.a();
                    if (a11 == null || (mapHttpError = ForSaleDataResult.Companion.success(a11)) == null) {
                        mapHttpError = ForSaleDataResult.Companion.emptyResponseError();
                    }
                }
                callback.onResponse(this.this$0, w.h(mapHttpError));
            }
        });
    }

    @Override // retrofit2.b
    public w<ForSaleDataResult<T>> execute() {
        ForSaleDataResult.Companion companion = ForSaleDataResult.Companion;
        T a11 = this.delegate.execute().a();
        o.f(a11);
        w<ForSaleDataResult<T>> h11 = w.h(companion.success(a11));
        o.h(h11, "success(...)");
        return h11;
    }

    @Override // retrofit2.b
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // retrofit2.b
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override // retrofit2.b
    public Request request() {
        Request request = this.delegate.request();
        o.h(request, "request(...)");
        return request;
    }

    @Override // retrofit2.b
    public z0 timeout() {
        z0 timeout = this.delegate.timeout();
        o.h(timeout, "timeout(...)");
        return timeout;
    }

    @Override // retrofit2.b
    public b<ForSaleDataResult<T>> clone() {
        b<T> mo6clone = this.delegate.mo6clone();
        o.h(mo6clone, "clone(...)");
        return new ResultCallAdapter(mo6clone, this.errorModelSerializer, this.errorMapper);
    }
}
