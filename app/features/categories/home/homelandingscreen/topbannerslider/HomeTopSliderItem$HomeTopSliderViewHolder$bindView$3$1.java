package com.forsale.app.features.categories.home.homelandingscreen.topbannerslider;

import com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeTopSliderItem.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$bindView$3$1", f = "HomeTopSliderItem.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class HomeTopSliderItem$HomeTopSliderViewHolder$bindView$3$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24213a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TopBannerSliderViewModel f24214b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HomeTopSliderItem.HomeTopSliderViewHolder f24215c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeTopSliderItem.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HomeTopSliderItem.HomeTopSliderViewHolder f24216a;

        a(HomeTopSliderItem.HomeTopSliderViewHolder homeTopSliderViewHolder) {
            this.f24216a = homeTopSliderViewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Boolean bool, zz.a<? super wz.p> aVar) {
            if (bool != null) {
                this.f24216a.j(!bool.booleanValue());
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTopSliderItem$HomeTopSliderViewHolder$bindView$3$1(TopBannerSliderViewModel topBannerSliderViewModel, HomeTopSliderItem.HomeTopSliderViewHolder homeTopSliderViewHolder, zz.a<? super HomeTopSliderItem$HomeTopSliderViewHolder$bindView$3$1> aVar) {
        super(2, aVar);
        this.f24214b = topBannerSliderViewModel;
        this.f24215c = homeTopSliderViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new HomeTopSliderItem$HomeTopSliderViewHolder$bindView$3$1(this.f24214b, this.f24215c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f24213a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<Boolean> f12 = this.f24214b.f();
            a aVar = new a(this.f24215c);
            this.f24213a = 1;
            if (f12.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((HomeTopSliderItem$HomeTopSliderViewHolder$bindView$3$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
