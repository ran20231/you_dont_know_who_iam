package com.forsale.app.utils;

import android.content.Context;
import android.net.Uri;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.google.android.gms.tasks.Task;
import io.c;
import java.util.Arrays;
import t9.y0;
/* compiled from: DynamicLinksUtils.kt */
/* loaded from: classes3.dex */
public final class DynamicLinksUtils {

    /* renamed from: a */
    private final Context f39549a;

    public DynamicLinksUtils(Context context) {
        kotlin.jvm.internal.o.i(context, "context");
        this.f39549a = context;
    }

    public static /* synthetic */ Task f(DynamicLinksUtils dynamicLinksUtils, String str, String str2, String str3, g00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return dynamicLinksUtils.e(str, str2, str3, lVar);
    }

    public static final void g(g00.l tmp0, Object obj) {
        kotlin.jvm.internal.o.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void h(String url, g00.l result, Exception it2) {
        kotlin.jvm.internal.o.i(url, "$url");
        kotlin.jvm.internal.o.i(result, "$result");
        kotlin.jvm.internal.o.i(it2, "it");
        String message = it2.getMessage();
        x10.a.b("addOnFailureListener " + message + " " + url, new Object[0]);
        result.invoke(url);
    }

    public final String d(String advId, ItemStatus itemStatus) {
        kotlin.jvm.internal.o.i(advId, "advId");
        kotlin.jvm.internal.o.i(itemStatus, "itemStatus");
        kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.f61809a;
        String string = this.f39549a.getString(y0.Qd);
        kotlin.jvm.internal.o.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{this.f39549a.getString(y0.f70447f2), Languages.Companion.b().getValue(), advId, itemStatus.getValue()}, 4));
        kotlin.jvm.internal.o.h(format, "format(...)");
        return format;
    }

    public final Task<io.f> e(final String url, final String str, final String str2, final g00.l<? super String, wz.p> result) {
        kotlin.jvm.internal.o.i(url, "url");
        kotlin.jvm.internal.o.i(result, "result");
        Task<io.f> addOnFailureListener = ko.a.c(ko.a.b(zo.a.f77775a), new g00.l<io.b, wz.p>() { // from class: com.forsale.app.utils.DynamicLinksUtils$shortenLink$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(io.b shortLinkAsync) {
                Context context;
                kotlin.jvm.internal.o.i(shortLinkAsync, "$this$shortLinkAsync");
                shortLinkAsync.c(Uri.parse(url));
                context = this.f39549a;
                shortLinkAsync.b(context.getString(y0.f70414d3));
                final String str3 = str;
                final String str4 = str2;
                ko.a.d(shortLinkAsync, new g00.l<c.a, wz.p>() { // from class: com.forsale.app.utils.DynamicLinksUtils$shortenLink$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(c.a socialMetaTagParameters) {
                        kotlin.jvm.internal.o.i(socialMetaTagParameters, "$this$socialMetaTagParameters");
                        String str5 = str3;
                        if (str5 != null) {
                            socialMetaTagParameters.c(str5);
                        }
                        String str6 = str4;
                        if (str6 != null) {
                            socialMetaTagParameters.b(str6);
                        }
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(c.a aVar) {
                        b(aVar);
                        return wz.p.f75480a;
                    }
                });
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(io.b bVar) {
                b(bVar);
                return wz.p.f75480a;
            }
        }).addOnSuccessListener(new m(new g00.l<io.f, wz.p>() { // from class: com.forsale.app.utils.DynamicLinksUtils$shortenLink$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(io.f fVar) {
                String str3;
                kotlin.jvm.internal.o.f(fVar);
                Uri a11 = ko.a.a(fVar);
                x10.a.b("addOnSuccessListener " + a11, new Object[0]);
                g00.l<String, wz.p> lVar = result;
                if (a11 == null || (str3 = a11.toString()) == null) {
                    str3 = url;
                }
                kotlin.jvm.internal.o.f(str3);
                lVar.invoke(str3);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(io.f fVar) {
                b(fVar);
                return wz.p.f75480a;
            }
        })).addOnFailureListener(new n(url, result));
        kotlin.jvm.internal.o.h(addOnFailureListener, "addOnFailureListener(...)");
        return addOnFailureListener;
    }
}
