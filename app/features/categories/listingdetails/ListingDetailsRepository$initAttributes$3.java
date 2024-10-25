package com.forsale.app.features.categories.listingdetails;

import androidx.lifecycle.b0;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import g00.p;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initAttributes$3", f = "ListingDetailsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$initAttributes$3 extends SuspendLambda implements p<List<? extends AttributesMapper.AttributesDataModel>, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25235a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25236b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25237c;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(((AttributesMapper.AttributesDataModel) t11).d(), ((AttributesMapper.AttributesDataModel) t12).d());
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$initAttributes$3(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$initAttributes$3> aVar) {
        super(2, aVar);
        this.f25237c = listingDetailsRepository;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(List<AttributesMapper.AttributesDataModel> list, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsRepository$initAttributes$3) create(list, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        ListingDetailsRepository$initAttributes$3 listingDetailsRepository$initAttributes$3 = new ListingDetailsRepository$initAttributes$3(this.f25237c, aVar);
        listingDetailsRepository$initAttributes$3.f25236b = obj;
        return listingDetailsRepository$initAttributes$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        List M0;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f25235a == 0) {
            kotlin.f.b(obj);
            b0Var = this.f25237c.F;
            M0 = CollectionsKt___CollectionsKt.M0((List) this.f25236b, new a());
            b0Var.postValue(M0);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
