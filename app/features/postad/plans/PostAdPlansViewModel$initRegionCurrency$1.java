package com.forsale.app.features.postad.plans;

import androidx.databinding.ObservableField;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdPlansViewModel.kt */
@d(c = "com.forsale.app.features.postad.plans.PostAdPlansViewModel$initRegionCurrency$1", f = "PostAdPlansViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdPlansViewModel$initRegionCurrency$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f36386a;

    /* renamed from: b  reason: collision with root package name */
    int f36387b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdPlansViewModel f36388c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdPlansViewModel$initRegionCurrency$1(PostAdPlansViewModel postAdPlansViewModel, zz.a<? super PostAdPlansViewModel$initRegionCurrency$1> aVar) {
        super(2, aVar);
        this.f36388c = postAdPlansViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdPlansViewModel$initRegionCurrency$1(this.f36388c, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.databinding.ObservableField] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel postAdViewModel;
        Integer num;
        ObservableField<String> observableField;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36387b;
        if (i11 != 0) {
            if (i11 == 1) {
                observableField = (ObservableField) this.f36386a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ObservableField<String> H0 = this.f36388c.H0();
            RegionsRepository I = this.f36388c.I();
            postAdViewModel = this.f36388c.f36372l0;
            ListingDetailsEntity n22 = postAdViewModel.n2();
            if (n22 != null) {
                num = kotlin.coroutines.jvm.internal.a.d(n22.getRegionId());
            } else {
                num = null;
            }
            this.f36386a = H0;
            this.f36387b = 1;
            Object regionCode = I.getRegionCode(num, this);
            if (regionCode == f11) {
                return f11;
            }
            observableField = H0;
            obj = regionCode;
        }
        observableField.k(obj);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdPlansViewModel$initRegionCurrency$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
