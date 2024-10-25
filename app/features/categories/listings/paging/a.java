package com.forsale.app.features.categories.listings.paging;

import androidx.paging.compose.LazyPagingItems;
import androidx.paging.f;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.features.categories.listings.paging.b;
import hd.c;
import kotlin.jvm.internal.o;
/* compiled from: extensions.kt */
/* loaded from: classes2.dex */
public final class a {
    private static final <T> boolean a(LazyPagingItems<T> lazyPagingItems) {
        if (lazyPagingItems.i().a().a() && lazyPagingItems.g() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> b b(LazyPagingItems<T> lazyPagingItems) {
        b bVar;
        o.i(lazyPagingItems, "<this>");
        if (lazyPagingItems.i().d() instanceof f.b) {
            return b.d.f31004a;
        }
        if (lazyPagingItems.i().d() instanceof f.a) {
            f d11 = lazyPagingItems.i().d();
            o.g(d11, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            bVar = new b.C0337b(((f.a) d11).b() instanceof ConnectivityInterceptor.ConnectivityException);
        } else if (lazyPagingItems.i().a() instanceof f.b) {
            return hd.a.f57490a;
        } else {
            if (lazyPagingItems.i().a() instanceof f.a) {
                f a11 = lazyPagingItems.i().a();
                o.g(a11, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                bVar = new hd.b(((f.a) a11).b() instanceof ConnectivityInterceptor.ConnectivityException);
            } else if (a(lazyPagingItems)) {
                return new b.a(false);
            } else {
                return c.f57492a;
            }
        }
        return bVar;
    }
}
