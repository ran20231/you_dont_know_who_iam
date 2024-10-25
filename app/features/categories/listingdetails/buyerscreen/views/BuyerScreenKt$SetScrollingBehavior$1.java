package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.z;
import com.forsale.app.features.categories.listingdetails.buyerscreen.q;
import eb.s;
import g00.l;
import g00.p;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import x.j;
import zz.a;
/* compiled from: BuyerScreen.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$1", f = "BuyerScreen.kt", l = {498}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BuyerScreenKt$SetScrollingBehavior$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26824a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f26825b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<s, wz.p> f26826c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q f26827d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyerScreen.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$1$2", f = "BuyerScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<j, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26829a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26830b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<s, wz.p> f26831c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f26832d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super s, wz.p> lVar, q qVar, a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.f26831c = lVar;
            this.f26832d = qVar;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(j jVar, a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(jVar, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f26831c, this.f26832d, aVar);
            anonymousClass2.f26830b = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f26829a == 0) {
                f.b(obj);
                j jVar = (j) this.f26830b;
                if (jVar != null) {
                    this.f26831c.invoke(new s(this.f26832d.c(), jVar.getKey().toString(), jVar.getIndex() + 1));
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuyerScreenKt$SetScrollingBehavior$1(LazyListState lazyListState, l<? super s, wz.p> lVar, q qVar, a<? super BuyerScreenKt$SetScrollingBehavior$1> aVar) {
        super(2, aVar);
        this.f26825b = lazyListState;
        this.f26826c = lVar;
        this.f26827d = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BuyerScreenKt$SetScrollingBehavior$1(this.f26825b, this.f26826c, this.f26827d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f26824a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            final LazyListState lazyListState = this.f26825b;
            Flow p11 = z.p(new g00.a<j>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$1.1
                {
                    super(0);
                }

                @Override // g00.a
                /* renamed from: b */
                public final j invoke() {
                    Object w02;
                    w02 = CollectionsKt___CollectionsKt.w0(LazyListState.this.x().c());
                    return (j) w02;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f26826c, this.f26827d, null);
            this.f26824a = 1;
            if (FlowKt.collectLatest(p11, anonymousClass2, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BuyerScreenKt$SetScrollingBehavior$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
