package com.forsale.app.features.postad.location;

import com.github.mikephil.charting.utils.Utils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel", f = "PostAdLocationViewModel.kt", l = {598}, m = "retrieveAddress")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$retrieveAddress$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f35752a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f35753b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35754c;

    /* renamed from: d  reason: collision with root package name */
    int f35755d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$retrieveAddress$1(PostAdLocationViewModel postAdLocationViewModel, zz.a<? super PostAdLocationViewModel$retrieveAddress$1> aVar) {
        super(aVar);
        this.f35754c = postAdLocationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object C2;
        this.f35753b = obj;
        this.f35755d |= Integer.MIN_VALUE;
        C2 = this.f35754c.C2(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, this);
        return C2;
    }
}
