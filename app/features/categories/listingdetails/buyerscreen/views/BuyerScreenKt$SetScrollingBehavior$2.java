package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.z;
import com.forsale.app.features.categories.listingdetails.buyerscreen.q;
import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import zz.a;
/* compiled from: BuyerScreen.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$2", f = "BuyerScreen.kt", l = {514}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BuyerScreenKt$SetScrollingBehavior$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26833a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f26834b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<gb.a, wz.p> f26835c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q f26836d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyerScreen.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$2$2", f = "BuyerScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$2$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<Boolean, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26838a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f26839b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<gb.a, wz.p> f26840c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f26841d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super gb.a, wz.p> lVar, q qVar, a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.f26840c = lVar;
            this.f26841d = qVar;
        }

        public final Object b(boolean z11, a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z11), aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f26840c, this.f26841d, aVar);
            anonymousClass2.f26839b = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, a<? super wz.p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f26838a == 0) {
                f.b(obj);
                this.f26840c.invoke(new gb.a(this.f26839b, this.f26841d.c().d().E(), this.f26841d.c().d().y()));
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuyerScreenKt$SetScrollingBehavior$2(LazyListState lazyListState, l<? super gb.a, wz.p> lVar, q qVar, a<? super BuyerScreenKt$SetScrollingBehavior$2> aVar) {
        super(2, aVar);
        this.f26834b = lazyListState;
        this.f26835c = lVar;
        this.f26836d = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BuyerScreenKt$SetScrollingBehavior$2(this.f26834b, this.f26835c, this.f26836d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f26833a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            final LazyListState lazyListState = this.f26834b;
            Flow p11 = z.p(new g00.a<Boolean>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$2.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Boolean invoke() {
                    return Boolean.valueOf(LazyListState.this.r() >= 2);
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f26835c, this.f26836d, null);
            this.f26833a = 1;
            if (FlowKt.collectLatest(p11, anonymousClass2, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BuyerScreenKt$SetScrollingBehavior$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
