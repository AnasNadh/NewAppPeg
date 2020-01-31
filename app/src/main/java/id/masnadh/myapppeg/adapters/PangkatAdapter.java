package id.masnadh.myapppeg.adapters;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import id.masnadh.myapppeg.R;
import id.masnadh.myapppeg.models.JabatanModel;
import id.masnadh.myapppeg.models.PangkatModel;

public class PangkatAdapter extends RecyclerView.Adapter<PangkatAdapter.ViewHolder> {

    public final static String TAG_ID = "id";
    String id;
    private Context context;
    private List<PangkatModel> jabatanModels;
    private ProgressDialog dialog;
    Boolean session = false;
    SharedPreferences sharedpreferences;
    ArrayList<HashMap<String ,String >> list_data;

    public PangkatAdapter(Context context, List<PangkatModel> jabatanModels) {
        this.context = context;
        this.jabatanModels = jabatanModels;
    }

    @NonNull
    @Override
    public PangkatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_pangkat, parent, false);
        PangkatAdapter.ViewHolder viewHolder = new PangkatAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PangkatAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
