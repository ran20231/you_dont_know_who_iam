package com.forsale.app.features.postad.location;

import com.github.mikephil.charting.utils.Utils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel", f = "PostAdLocationViewModel.kt", l = {588, 590}, m = "updateAddress")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$updateAddress$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f35791a;

    /* renamed from: b  reason: collision with root package name */
    double f35792b;

    /* renamed from: c  reason: collision with root package name */
    double f35793c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f35794d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35795e;

    /* renamed from: f  reason: collision with root package name */
    int f35796f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$updateAddress$1(PostAdLocationViewModel postAdLocationViewModel, zz.a<? super PostAdLocationViewModel$updateAddress$1> aVar) {
        super(aVar);
        this.f35795e = postAdLocationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object T2;
        this.f35794d = obj;
        this.f35796f |= Integer.MIN_VALUE;
        T2 = this.f35795e.T2(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, null, this);
        return T2;
    }
}
