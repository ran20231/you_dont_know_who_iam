package com.forsale.adserver.view.screens.offersScreen;

import g00.p;
import java.util.Collection;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$_showFeaturedCategory$1", f = "OffersViewModel.kt", l = {78, 78}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$_showFeaturedCategory$1 extends SuspendLambda implements p<FlowCollector<? super Boolean>, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21434a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f21435b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ OffersViewModel f21436c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersViewModel$_showFeaturedCategory$1(OffersViewModel offersViewModel, a<? super OffersViewModel$_showFeaturedCategory$1> aVar) {
        super(2, aVar);
        this.f21436c = offersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        OffersViewModel$_showFeaturedCategory$1 offersViewModel$_showFeaturedCategory$1 = new OffersViewModel$_showFeaturedCategory$1(this.f21436c, aVar);
        offersViewModel$_showFeaturedCategory$1.f21435b = obj;
        return offersViewModel$_showFeaturedCategory$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        FlowCollector flowCollector;
        f11 = b.f();
        int i11 = this.f21434a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f21435b;
            f.b(obj);
        } else {
            f.b(obj);
            flowCollector = (FlowCollector) this.f21435b;
            OffersViewModel offersViewModel = this.f21436c;
            this.f21435b = flowCollector;
            this.f21434a = 1;
            obj = offersViewModel.r(this);
            if (obj == f11) {
                return f11;
            }
        }
        Boolean a11 = kotlin.coroutines.jvm.internal.a.a(!((Collection) obj).isEmpty());
        this.f21435b = null;
        this.f21434a = 2;
        if (flowCollector.emit(a11, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, a<? super wz.p> aVar) {
        return ((OffersViewModel$_showFeaturedCategory$1) create(flowCollector, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
