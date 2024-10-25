package com.forsale.app.features.categories.listings.paging;

import androidx.compose.foundation.lazy.LazyListState;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.DelayKt;
import wz.p;
/* compiled from: PagedListings.kt */
@d(c = "com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$scrollAction$1$1", f = "PagedListings.kt", l = {61, 62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PagedListingsKt$PagedListings$scrollAction$1$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30981a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f30982b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedListingsKt$PagedListings$scrollAction$1$1(LazyListState lazyListState, zz.a<? super PagedListingsKt$PagedListings$scrollAction$1$1> aVar) {
        super(1, aVar);
        this.f30982b = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PagedListingsKt$PagedListings$scrollAction$1$1(this.f30982b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30981a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            this.f30981a = 1;
            if (DelayKt.delay(100L, this) == f11) {
                return f11;
            }
        }
        LazyListState lazyListState = this.f30982b;
        this.f30981a = 2;
        if (LazyListState.k(lazyListState, 0, 0, this, 2, null) == f11) {
            return f11;
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PagedListingsKt$PagedListings$scrollAction$1$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
