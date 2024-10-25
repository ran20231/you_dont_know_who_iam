package com.forsale.app.datalayer.network.interceptors;

import com.forsale.app.datalayer.network.ResponseWrapper;
import com.google.gson.d;
import dj.i;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.c;
import okio.e;
import x10.a;
/* compiled from: HTTPStatusInterceptor.kt */
/* loaded from: classes2.dex */
public final class HTTPStatusInterceptor implements Interceptor {
    public static final int $stable = 0;

    private final String format(Request request, Response response) {
        String str;
        e source;
        e peek;
        c cVar = new c();
        RequestBody body = request.body();
        if (body != null) {
            body.writeTo(cVar);
        }
        HttpUrl url = request.url();
        Headers headers = request.headers();
        String y12 = cVar.y1();
        Headers headers2 = response.headers();
        ResponseBody body2 = response.body();
        if (body2 != null && (source = body2.source()) != null && (peek = source.peek()) != null) {
            str = peek.y1();
        } else {
            str = null;
        }
        return "############################## Start ##############################\n############################## API ##############################\n" + url + "\n################################# Request Headers ###########################\n" + headers + "################################# Request Body ###########################\n" + y12 + "\n################################# Response Headers ###########################\n" + headers2 + "################################# Response Body ###########################\n" + str + "\n################################# End ###########################";
    }

    private final int getStatusCode(Response response) {
        String str;
        e source;
        e peek;
        if (response.isSuccessful()) {
            d dVar = new d();
            ResponseBody body = response.body();
            if (body != null && (source = body.source()) != null && (peek = source.peek()) != null) {
                str = peek.y1();
            } else {
                str = null;
            }
            return ((ResponseWrapper) dVar.k(str, ResponseWrapper.class)).getStatus();
        }
        return response.code();
    }

    private final void reportHTTPError(Request request, Response response, String str) {
        List<String> j02;
        String format = format(request, response);
        i invoke = i.f54287a.invoke();
        j02 = StringsKt__StringsKt.j0(format);
        for (String str2 : j02) {
            invoke.c(str2);
        }
        Throwable th2 = new Throwable(str);
        a.c(th2);
        invoke.f(th2);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        o.i(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        int statusCode = getStatusCode(proceed);
        if (statusCode != 401) {
            if (statusCode == 500) {
                reportHTTPError(chain.request(), proceed, "HTTP 500 Internal Sever Error");
            }
        } else {
            reportHTTPError(chain.request(), proceed, "HTTP 401 Unauthorized Request.");
        }
        return proceed;
    }
}
