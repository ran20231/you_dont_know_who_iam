package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.interactors.SetupCalculator;
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
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.CalculatorViewModel$setupCalculator$1", f = "CalculatorViewModel.kt", l = {31, 33}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CalculatorViewModel$setupCalculator$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34584a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f34585b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CalculatorViewModel f34586c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingDetailsEntity f34587d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PostListingIntention f34588e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ List<Addon> f34589f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculatorViewModel$setupCalculator$1(CalculatorViewModel calculatorViewModel, ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, List<Addon> list, zz.a<? super CalculatorViewModel$setupCalculator$1> aVar) {
        super(2, aVar);
        this.f34586c = calculatorViewModel;
        this.f34587d = listingDetailsEntity;
        this.f34588e = postListingIntention;
        this.f34589f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        CalculatorViewModel$setupCalculator$1 calculatorViewModel$setupCalculator$1 = new CalculatorViewModel$setupCalculator$1(this.f34586c, this.f34587d, this.f34588e, this.f34589f, aVar);
        calculatorViewModel$setupCalculator$1.f34585b = obj;
        return calculatorViewModel$setupCalculator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        com.forsale.app.features.postad.a aVar;
        PostAdViewModel postAdViewModel;
        Object g11;
        f11 = b.f();
        int i11 = this.f34584a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f34585b;
            aVar = this.f34586c.f34575a;
            SetupCalculator b11 = aVar.b();
            ListingDetailsEntity listingDetailsEntity = this.f34587d;
            PostListingIntention postListingIntention = this.f34588e;
            List<Addon> list = this.f34589f;
            this.f34584a = 1;
            obj = b11.b(listingDetailsEntity, postListingIntention, list, coroutineScope, this);
            if (obj == f11) {
                return f11;
            }
        }
        CalculatorViewModel calculatorViewModel = this.f34586c;
        PostListingIntention postListingIntention2 = this.f34588e;
        CalculatorEntity calculatorEntity = (CalculatorEntity) obj;
        postAdViewModel = calculatorViewModel.f34576b;
        postAdViewModel.J4(calculatorEntity);
        this.f34585b = obj;
        this.f34584a = 2;
        g11 = calculatorViewModel.g(calculatorEntity, postListingIntention2, this);
        if (g11 == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CalculatorViewModel$setupCalculator$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
