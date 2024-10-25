package com.forsale.app.features.postad.media.imagetutorials;

import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.p;
/* compiled from: ImageTutorialListViewModel.kt */
/* loaded from: classes2.dex */
public final class ImageTutorialListViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final PostAdViewModel f35931k0;

    /* renamed from: l0  reason: collision with root package name */
    private final MutableSharedFlow<List<CategoryRuleSet.Tutorial>> f35932l0;

    /* renamed from: m0  reason: collision with root package name */
    private final SharedFlow<List<CategoryRuleSet.Tutorial>> f35933m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableSharedFlow<p> f35934n0;

    /* renamed from: o0  reason: collision with root package name */
    private final SharedFlow<p> f35935o0;

    /* compiled from: ImageTutorialListViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        ImageTutorialListViewModel a(PostAdViewModel postAdViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTutorialListViewModel(PostAdViewModel postAdViewModel, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(postAdViewModel, "postAdViewModel");
        o.i(baseRepository, "baseRepository");
        this.f35931k0 = postAdViewModel;
        MutableSharedFlow<List<CategoryRuleSet.Tutorial>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35932l0 = MutableSharedFlow$default;
        this.f35933m0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35934n0 = MutableSharedFlow$default2;
        this.f35935o0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        y0();
    }

    private final void y0() {
        CategoryRuleSet.MediaConfiguration media;
        List<CategoryRuleSet.Tutorial> tutorials;
        CategoryRuleSet.RuleSet value = this.f35931k0.d2().getValue();
        if (value != null && (media = value.getMedia()) != null && (tutorials = media.getTutorials()) != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ImageTutorialListViewModel$getTutorials$1$1(this, tutorials, null), 3, null);
        }
    }

    public final void A0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ImageTutorialListViewModel$onDoneClicked$1(this, null), 3, null);
    }

    public final SharedFlow<p> x0() {
        return this.f35935o0;
    }

    public final SharedFlow<List<CategoryRuleSet.Tutorial>> z0() {
        return this.f35933m0;
    }
}
