package com.forsale.app.features.welcome.loading;

import com.forsale.app.datalayer.database.ContactData;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$openContactUsBottomSheet$1", f = "LoadingViewModel.kt", l = {331, 335}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$openContactUsBottomSheet$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37284a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37285b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$openContactUsBottomSheet$1(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$openContactUsBottomSheet$1> aVar) {
        super(2, aVar);
        this.f37285b = loadingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$openContactUsBottomSheet$1(this.f37285b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        RegionsRepository regionsRepository;
        int y11;
        MutableStateFlow mutableStateFlow;
        String C;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37284a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            regionsRepository = this.f37285b.f37216y;
            this.f37284a = 1;
            obj = regionsRepository.getCurrentRegion(this);
            if (obj == f11) {
                return f11;
            }
        }
        List<ContactData> contactData = ((RegionEntity) obj).getContactData();
        y11 = s.y(contactData, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ContactData contactData2 : contactData) {
            C = kotlin.text.s.C(contactData2.getPhone(), "+", "", false, 4, null);
            arrayList.add(C);
        }
        mutableStateFlow = this.f37285b.S;
        ab.a aVar = new ab.a(UserContactMode.CALL_ONLY, true, arrayList);
        this.f37284a = 2;
        if (mutableStateFlow.emit(aVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$openContactUsBottomSheet$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
