package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import androidx.compose.runtime.z;
import com.google.accompanist.pager.PagerState;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalImagePagerSlider.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.VerticalImagePagerSliderKt$VerticalImagePagerSlider$1$1", f = "VerticalImagePagerSlider.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalImagePagerSliderKt$VerticalImagePagerSlider$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26232a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PagerState f26233b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<Integer, wz.p> f26234c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalImagePagerSlider.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<Integer, wz.p> f26236a;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Integer, wz.p> lVar) {
            this.f26236a = lVar;
        }

        public final Object a(int i11, zz.a<? super wz.p> aVar) {
            this.f26236a.invoke(kotlin.coroutines.jvm.internal.a.d(i11));
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
    public VerticalImagePagerSliderKt$VerticalImagePagerSlider$1$1(PagerState pagerState, l<? super Integer, wz.p> lVar, zz.a<? super VerticalImagePagerSliderKt$VerticalImagePagerSlider$1$1> aVar) {
        super(2, aVar);
        this.f26233b = pagerState;
        this.f26234c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalImagePagerSliderKt$VerticalImagePagerSlider$1$1(this.f26233b, this.f26234c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26232a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            final PagerState pagerState = this.f26233b;
            Flow p11 = z.p(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.VerticalImagePagerSliderKt$VerticalImagePagerSlider$1$1.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Integer invoke() {
                    return Integer.valueOf(PagerState.this.k());
                }
            });
            a aVar = new a(this.f26234c);
            this.f26232a = 1;
            if (p11.collect(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalImagePagerSliderKt$VerticalImagePagerSlider$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
