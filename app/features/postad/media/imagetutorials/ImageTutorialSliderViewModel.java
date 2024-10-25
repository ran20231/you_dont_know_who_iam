package com.forsale.app.features.postad.media.imagetutorials;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.features.postad.PostAdViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: ImageTutorialSliderViewModel.kt */
/* loaded from: classes2.dex */
public final class ImageTutorialSliderViewModel extends q0 {

    /* renamed from: a  reason: collision with root package name */
    private final PostAdViewModel f35941a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f35942b;

    /* renamed from: c  reason: collision with root package name */
    private final StateFlow<Boolean> f35943c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<p> f35944d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedFlow<p> f35945e;

    /* renamed from: f  reason: collision with root package name */
    private final b0<List<CategoryRuleSet.Tutorial>> f35946f;

    /* renamed from: g  reason: collision with root package name */
    private final LiveData<List<CategoryRuleSet.Tutorial>> f35947g;

    /* compiled from: ImageTutorialSliderViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        ImageTutorialSliderViewModel a(PostAdViewModel postAdViewModel);
    }

    public ImageTutorialSliderViewModel(PostAdViewModel postAdViewModel) {
        o.i(postAdViewModel, "postAdViewModel");
        this.f35941a = postAdViewModel;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f35942b = MutableStateFlow;
        this.f35943c = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35944d = MutableSharedFlow$default;
        this.f35945e = FlowKt.asSharedFlow(MutableSharedFlow$default);
        b0<List<CategoryRuleSet.Tutorial>> b0Var = new b0<>();
        this.f35946f = b0Var;
        this.f35947g = b0Var;
        j();
    }

    private final void j() {
        CategoryRuleSet.MediaConfiguration media;
        List<CategoryRuleSet.Tutorial> tutorials;
        CategoryRuleSet.RuleSet value = this.f35941a.d2().getValue();
        if (value != null && (media = value.getMedia()) != null && (tutorials = media.getTutorials()) != null) {
            this.f35946f.postValue(tutorials);
        }
    }

    public final SharedFlow<p> g() {
        return this.f35945e;
    }

    public final StateFlow<Boolean> h() {
        return this.f35943c;
    }

    public final LiveData<List<CategoryRuleSet.Tutorial>> k() {
        return this.f35947g;
    }

    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ImageTutorialSliderViewModel$onNextClicked$1(this, null), 3, null);
    }

    public final void m(int i11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ImageTutorialSliderViewModel$onPageSelected$1(this, i11, null), 3, null);
    }

    public final void o() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ImageTutorialSliderViewModel$onSkipClicked$1(this, null), 3, null);
    }
}
