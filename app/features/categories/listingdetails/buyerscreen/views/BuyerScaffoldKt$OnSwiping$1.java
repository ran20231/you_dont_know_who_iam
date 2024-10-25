package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.z;
import com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel;
import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerScaffold.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$OnSwiping$1", f = "BuyerScaffold.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerScaffoldKt$OnSwiping$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26620a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PagerState f26621b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f26622c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<Integer, wz.p> f26623d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyerScaffold.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BuyerListingDetailsScreenViewModel f26626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<Integer, wz.p> f26627b;

        /* JADX WARN: Multi-variable type inference failed */
        a(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, l<? super Integer, wz.p> lVar) {
            this.f26626a = buyerListingDetailsScreenViewModel;
            this.f26627b = lVar;
        }

        public final Object a(int i11, zz.a<? super wz.p> aVar) {
            this.f26626a.U0(i11);
            this.f26627b.invoke(kotlin.coroutines.jvm.internal.a.d(i11));
            return wz.p.f75480a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Integer num, zz.a aVar) {
            return a(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuyerScaffoldKt$OnSwiping$1(PagerState pagerState, BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, l<? super Integer, wz.p> lVar, zz.a<? super BuyerScaffoldKt$OnSwiping$1> aVar) {
        super(2, aVar);
        this.f26621b = pagerState;
        this.f26622c = buyerListingDetailsScreenViewModel;
        this.f26623d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerScaffoldKt$OnSwiping$1(this.f26621b, this.f26622c, this.f26623d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f26620a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            final PagerState pagerState = this.f26621b;
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(z.p(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$OnSwiping$1.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Integer invoke() {
                    return Integer.valueOf(PagerState.this.P());
                }
            }), new p<Integer, Integer, Boolean>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$OnSwiping$1.2
                public final Boolean b(int i12, int i13) {
                    boolean z11;
                    if (i12 != i13) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2) {
                    return b(num.intValue(), num2.intValue());
                }
            });
            a aVar = new a(this.f26622c, this.f26623d);
            this.f26620a = 1;
            if (distinctUntilChanged.collect(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerScaffoldKt$OnSwiping$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
