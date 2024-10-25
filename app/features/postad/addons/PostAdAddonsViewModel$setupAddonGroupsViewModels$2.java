package com.forsale.app.features.postad.addons;

import androidx.lifecycle.r0;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.datalayer.network.responses.AddonsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItemViewModel;
import com.forsale.app.features.postad.addons.addonsgroupitem.ExpansionStatus;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$setupAddonGroupsViewModels$2", f = "PostAdAddonsViewModel.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$setupAddonGroupsViewModels$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34367a;

    /* renamed from: b  reason: collision with root package name */
    Object f34368b;

    /* renamed from: c  reason: collision with root package name */
    int f34369c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34370d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AddonsResponse f34371e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$setupAddonGroupsViewModels$2(PostAdAddonsViewModel postAdAddonsViewModel, AddonsResponse addonsResponse, zz.a<? super PostAdAddonsViewModel$setupAddonGroupsViewModels$2> aVar) {
        super(2, aVar);
        this.f34370d = postAdAddonsViewModel;
        this.f34371e = addonsResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsViewModel$setupAddonGroupsViewModels$2(this.f34370d, this.f34371e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        int y11;
        MutableSharedFlow mutableSharedFlow;
        PostAdAddonsViewModel postAdAddonsViewModel;
        List list;
        ExpansionStatus expansionStatus;
        ListingDetailsEntity listingDetailsEntity;
        ApplicationResourcesRepository applicationResourcesRepository;
        g00.a aVar;
        p pVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34369c;
        if (i11 != 0) {
            if (i11 == 1) {
                postAdAddonsViewModel = (PostAdAddonsViewModel) this.f34368b;
                list = (List) this.f34367a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PostAdAddonsViewModel postAdAddonsViewModel2 = this.f34370d;
            List<AddonsGroup> addonsGroups = this.f34371e.getAddonsGroups();
            PostAdAddonsViewModel postAdAddonsViewModel3 = this.f34370d;
            y11 = s.y(addonsGroups, 10);
            ArrayList arrayList = new ArrayList(y11);
            int i12 = 0;
            for (Object obj2 : addonsGroups) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    r.x();
                }
                AddonsGroup addonsGroup = (AddonsGroup) obj2;
                if (i12 == 0) {
                    expansionStatus = ExpansionStatus.EXPANDED;
                } else {
                    expansionStatus = ExpansionStatus.COLLAPSED;
                }
                CoroutineScope a11 = r0.a(postAdAddonsViewModel3);
                listingDetailsEntity = postAdAddonsViewModel3.f34325r0;
                applicationResourcesRepository = postAdAddonsViewModel3.f34322o0;
                aVar = postAdAddonsViewModel3.H0;
                pVar = postAdAddonsViewModel3.I0;
                AddonsGroupItemViewModel addonsGroupItemViewModel = new AddonsGroupItemViewModel(a11, expansionStatus, addonsGroup, listingDetailsEntity, applicationResourcesRepository, aVar, pVar);
                postAdAddonsViewModel3.D1(addonsGroupItemViewModel.d());
                arrayList.add(addonsGroupItemViewModel);
                i12 = i13;
            }
            mutableSharedFlow = this.f34370d.f34331x0;
            this.f34367a = arrayList;
            this.f34368b = postAdAddonsViewModel2;
            this.f34369c = 1;
            if (mutableSharedFlow.emit(arrayList, this) == f11) {
                return f11;
            }
            postAdAddonsViewModel = postAdAddonsViewModel2;
            list = arrayList;
        }
        postAdAddonsViewModel.G0 = list;
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsViewModel$setupAddonGroupsViewModels$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
