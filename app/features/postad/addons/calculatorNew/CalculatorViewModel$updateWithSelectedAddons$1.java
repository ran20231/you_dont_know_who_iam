package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.models.CalculatorEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalculatorViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel$updateWithSelectedAddons$1", f = "CalculatorViewModel.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CalculatorViewModel$updateWithSelectedAddons$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34590a;

    /* renamed from: b  reason: collision with root package name */
    int f34591b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CalculatorViewModel f34592c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Addon> f34593d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PostListingIntention f34594e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculatorViewModel$updateWithSelectedAddons$1(CalculatorViewModel calculatorViewModel, List<Addon> list, PostListingIntention postListingIntention, zz.a<? super CalculatorViewModel$updateWithSelectedAddons$1> aVar) {
        super(2, aVar);
        this.f34592c = calculatorViewModel;
        this.f34593d = list;
        this.f34594e = postListingIntention;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CalculatorViewModel$updateWithSelectedAddons$1(this.f34592c, this.f34593d, this.f34594e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel postAdViewModel;
        PostAdViewModel postAdViewModel2;
        Object e11;
        f11 = b.f();
        int i11 = this.f34591b;
        if (i11 != 0) {
            if (i11 == 1) {
                CalculatorEntity calculatorEntity = (CalculatorEntity) this.f34590a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            postAdViewModel = this.f34592c.f34576b;
            CalculatorEntity value = postAdViewModel.a2().getValue();
            if (value != null) {
                List<Addon> list = this.f34593d;
                CalculatorViewModel calculatorViewModel = this.f34592c;
                PostListingIntention postListingIntention = this.f34594e;
                CalculatorEntity b11 = CalculatorEntity.b(value, 0.0f, 0.0f, false, 0.0f, 0.0f, list, null, null, false, null, 0, false, 4063, null);
                postAdViewModel2 = calculatorViewModel.f34576b;
                postAdViewModel2.J4(b11);
                this.f34590a = b11;
                this.f34591b = 1;
                e11 = calculatorViewModel.e(b11, postListingIntention, this);
                if (e11 == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CalculatorViewModel$updateWithSelectedAddons$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
