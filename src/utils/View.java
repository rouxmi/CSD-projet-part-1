package utils;

import java.util.LinkedList;
import java.util.List;

import pt.unl.fct.di.novasys.network.data.Host;

public class View {

    private List<Host> view;
    private int viewNumber;

    public View(List<Host> view, int viewNumber) {
        this.view = view;
        this.viewNumber = viewNumber;
    }

    public View(int viewNumber) {
        this.viewNumber = viewNumber;
        this.view = new LinkedList<>();
    }

    public List<Host> getView() {
        return view;
    }

    public Host getLeader() {
        return view.get(viewNumber);
    }

    public int getViewNumber() {
        return viewNumber;
    }

    public boolean isLeader(Host host) {
        return view.get(viewNumber%view.size()).equals(host);
    }
    
    public boolean checkIfLeader(Host host, int viewNumber) {
        return view.get(viewNumber%view.size()).equals(host);
    }

    public void incrementViewNumber() {
        viewNumber++;
    }

    public void setViewNumber(int viewNumber) {
        this.viewNumber = viewNumber;
    }

    public boolean isMember(Host host) {
        return view.contains(host);
    }

    public void addMember(Host host) {
        view.add(host);
    }

    public int size() {
        return view.size();
    }

    @Override
    public String toString() {
        return "View{" +
                "view=" + view +
                ", viewNumber=" + viewNumber +
                '}';
    }
}
